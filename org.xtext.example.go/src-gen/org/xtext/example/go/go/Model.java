/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.go.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.go.go.Model#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.go.go.GoPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.go.go.SourceFile}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.example.go.go.GoPackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<SourceFile> getElements();

} // Model
