/*
 * Copyright (C) 2003-2013 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.exoplatform.document.entity;

/**
 * @author <a href="mailto:sondn@exoplatform.com">Ngoc Son Dang</a>
 * @version Parent.java Oct 31, 2013
 * 
 */
public class Parent extends BaseEntityIdentity {

	private static final long serialVersionUID = -9174189865264723277L;

	private String parentLink;

	private boolean isRoot;

	public Parent() {
		super();
	}

	/**
	 * @param parentLink
	 * @param isRoot
	 */
	public Parent(String parentLink, boolean isRoot) {
		super();
		this.parentLink = parentLink;
		this.isRoot = isRoot;
	}

	/**
	 * @return the parentLink
	 */
	public String getParentLink() {
		return parentLink;
	}

	/**
	 * @param parentLink
	 *            the parentLink to set
	 */
	public void setParentLink(String parentLink) {
		this.parentLink = parentLink;
	}

	/**
	 * @return the isRoot
	 */
	public boolean isRoot() {
		return isRoot;
	}

	/**
	 * @param isRoot
	 *            the isRoot to set
	 */
	public void setRoot(boolean isRoot) {
		this.isRoot = isRoot;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isRoot ? 1231 : 1237);
		result = prime * result
				+ ((parentLink == null) ? 0 : parentLink.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Parent)) {
			return false;
		}
		Parent other = (Parent) obj;
		if (isRoot != other.isRoot) {
			return false;
		}
		if (parentLink == null) {
			if (other.parentLink != null) {
				return false;
			}
		} else if (!parentLink.equals(other.parentLink)) {
			return false;
		}
		return true;
	}
}
