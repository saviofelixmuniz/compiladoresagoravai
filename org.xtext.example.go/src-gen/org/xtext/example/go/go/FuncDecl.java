/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.go.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.go.go.FuncDecl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.xtext.example.go.go.FuncDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.go.go.FuncDecl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.xtext.example.go.go.FuncDecl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.go.go.GoPackage#getFuncDecl()
 * @model
 * @generated
 */
public interface FuncDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Receiver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver</em>' attribute.
   * @see #setReceiver(String)
   * @see org.xtext.example.go.go.GoPackage#getFuncDecl_Receiver()
   * @model
   * @generated
   */
  String getReceiver();

  /**
   * Sets the value of the '{@link org.xtext.example.go.go.FuncDecl#getReceiver <em>Receiver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' attribute.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.go.go.GoPackage#getFuncDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.go.go.FuncDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Signature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' attribute.
   * @see #setSignature(String)
   * @see org.xtext.example.go.go.GoPackage#getFuncDecl_Signature()
   * @model
   * @generated
   */
  String getSignature();

  /**
   * Sets the value of the '{@link org.xtext.example.go.go.FuncDecl#getSignature <em>Signature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' attribute.
   * @see #getSignature()
   * @generated
   */
  void setSignature(String value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Block)
   * @see org.xtext.example.go.go.GoPackage#getFuncDecl_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link org.xtext.example.go.go.FuncDecl#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

} // FuncDecl
