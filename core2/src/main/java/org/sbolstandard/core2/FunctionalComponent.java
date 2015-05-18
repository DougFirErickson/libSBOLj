package org.sbolstandard.core2;

import java.net.URI;

import static org.sbolstandard.core2.URIcompliance.*;

/**
 * @author Zhen Zhang
 * @author Tramy Nguyen
 * @author Nicholas Roehner
 * @author Matthew Pocock
 * @author Goksel Misirli
 * @author Chris Myers
 * @version 2.0-beta
 */

public class FunctionalComponent extends ComponentInstance {

	private DirectionType direction;

	FunctionalComponent(URI identity, AccessType access, URI definitionURI,
			DirectionType direction) {
		super(identity, access, definitionURI);
		setDirection(direction);
	}
	
	private FunctionalComponent(FunctionalComponent functionalComponent) {
		super(functionalComponent);
		this.setDirection(functionalComponent.getDirection());
	}

	/**
	 * Returns field variable <code>direction</code> to the specified element.
	 * 
	 * @return field variable <code>direction</code> to the specified element
	 */
	public DirectionType getDirection() {
		return direction;
	}

	/**
	 * Returns the direction type in URI.
	 * 
	 * @return direction type in URI
	 */
	URI getDirectionURI() {
		if (direction != null) {
			if (direction.equals(DirectionType.INOUT)) {
				return Direction.INOUT;
			} else if (direction.equals(DirectionType.INPUT)) {
				return Direction.INPUT;
			} else if (direction.equals(DirectionType.OUTPUT)) {
				return Direction.OUTPUT;
			} else if (direction.equals(DirectionType.NONE)) {
				return Direction.NONE;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * Sets field variable <code>direction</code> to the specified element.
	 */
	public void setDirection(DirectionType direction) {
		if (sbolDocument!=null) sbolDocument.checkReadOnly();
		if (direction==null) {
			throw new NullPointerException("Not a valid direction type.");
		}
		this.direction = direction;
	}

	/**
	 * Sets field variable <code>direction</code> to the element corresponding
	 * to the specified URI.
	 */
	void setDirection(URI direction) {
		if (direction != null && direction.equals(Direction.INPUT)) {
			this.direction = DirectionType.INPUT;
		} else if (direction != null && direction.equals(Direction.OUTPUT)) {
			this.direction = DirectionType.OUTPUT;
		} else if (direction != null && direction.equals(Direction.INOUT)) {
			this.direction = DirectionType.INOUT;
		} else if (direction != null && direction.equals(Direction.NONE)) {
			this.direction = DirectionType.NONE;
		} else {
			throw new IllegalArgumentException("Not a valid access type.");
		}
	}

	static final class Direction {
		public static final URI	INPUT	= URI.create(Sbol2Terms.sbol2.getNamespaceURI() + "input");
		public static final URI	OUTPUT	= URI.create(Sbol2Terms.sbol2.getNamespaceURI() + "output");
		public static final URI	INOUT	= URI.create(Sbol2Terms.sbol2.getNamespaceURI() + "inout");
		public static final URI	NONE	= URI.create(Sbol2Terms.sbol2.getNamespaceURI() + "none");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((direction == null) ? 0 : direction.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FunctionalComponent other = (FunctionalComponent) obj;
		return direction == other.direction;
	}

	@Override
	protected FunctionalComponent deepCopy() {
		return new FunctionalComponent(this);
	}

	/**
	 * Assume this Component object and all its descendants (children, grand children, etc) have compliant URI, and all given parameters have compliant forms.
	 * This method is called by {@link ComponentDefinition#copy(String, String, String)}.
	 */
	void updateCompliantURI(String URIprefix, String parentDisplayId, String version) {
		String thisObjDisplayId = extractDisplayId(this.getIdentity()); // 1 indicates that this object is a child of a top-level object.
		URI newIdentity = URI.create(URIprefix + '/' + parentDisplayId + '/' 
				+ thisObjDisplayId + '/' + version);
		if (!this.getMapsTos().isEmpty()) {
			// Update children's URIs
			for (MapsTo mapsTo : this.getMapsTos()) {
				mapsTo.updateCompliantURI(URIprefix, parentDisplayId, thisObjDisplayId, version);
			}
		}
		// TODO: need to set wasDerivedFrom here?
		this.setWasDerivedFrom(this.getIdentity());
		this.setIdentity(newIdentity);		
	}
}
