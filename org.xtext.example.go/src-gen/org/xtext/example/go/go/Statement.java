/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.go.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.go.go.Statement#getSwitchStmt <em>Switch Stmt</em>}</li>
 *   <li>{@link org.xtext.example.go.go.Statement#getReturnStmt <em>Return Stmt</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.go.go.GoPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Switch Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch Stmt</em>' containment reference.
   * @see #setSwitchStmt(SwitchStmt)
   * @see org.xtext.example.go.go.GoPackage#getStatement_SwitchStmt()
   * @model containment="true"
   * @generated
   */
  SwitchStmt getSwitchStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.go.go.Statement#getSwitchStmt <em>Switch Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch Stmt</em>' containment reference.
   * @see #getSwitchStmt()
   * @generated
   */
  void setSwitchStmt(SwitchStmt value);

  /**
   * Returns the value of the '<em><b>Return Stmt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Stmt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Stmt</em>' attribute.
   * @see #setReturnStmt(String)
   * @see org.xtext.example.go.go.GoPackage#getStatement_ReturnStmt()
   * @model
   * @generated
   */
  String getReturnStmt();

  /**
   * Sets the value of the '{@link org.xtext.example.go.go.Statement#getReturnStmt <em>Return Stmt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Stmt</em>' attribute.
   * @see #getReturnStmt()
   * @generated
   */
  void setReturnStmt(String value);

} // Statement
