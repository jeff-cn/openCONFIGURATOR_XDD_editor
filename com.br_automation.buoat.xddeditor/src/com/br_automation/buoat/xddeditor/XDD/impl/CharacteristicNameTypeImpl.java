/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.br_automation.buoat.xddeditor.XDD.impl;

import com.br_automation.buoat.xddeditor.XDD.CharacteristicNameType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionRefType;
import com.br_automation.buoat.xddeditor.XDD.DescriptionType;
import com.br_automation.buoat.xddeditor.XDD.LabelRefType;
import com.br_automation.buoat.xddeditor.XDD.LabelType;
import com.br_automation.buoat.xddeditor.XDD.XDDPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Characteristic Name Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicNameTypeImpl#getGroup
 * <em>Group</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicNameTypeImpl#getLabel
 * <em>Label</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicNameTypeImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicNameTypeImpl#getLabelRef
 * <em>Label Ref</em>}</li>
 * <li>
 * {@link com.br_automation.buoat.xddeditor.XDD.impl.CharacteristicNameTypeImpl#getDescriptionRef
 * <em>Description Ref</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CharacteristicNameTypeImpl extends EObjectImpl implements CharacteristicNameType {
    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected FeatureMap group;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected CharacteristicNameTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XDDPackage.eINSTANCE.getCharacteristicNameType();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureMap getGroup() {
        if (group == null) {
            group = new BasicFeatureMap(this, XDDPackage.CHARACTERISTIC_NAME_TYPE__GROUP);
        }
        return group;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelType> getLabel() {
        return getGroup().list(XDDPackage.eINSTANCE.getCharacteristicNameType_Label());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionType> getDescription() {
        return getGroup().list(XDDPackage.eINSTANCE.getCharacteristicNameType_Description());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<LabelRefType> getLabelRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getCharacteristicNameType_LabelRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EList<DescriptionRefType> getDescriptionRef() {
        return getGroup().list(XDDPackage.eINSTANCE.getCharacteristicNameType_DescriptionRef());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd,
        int featureID,
        NotificationChain msgs) {
        switch (featureID) {
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__GROUP:
                return ((InternalEList<?>) getGroup()).basicRemove(otherEnd, msgs);
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__LABEL:
                return ((InternalEList<?>) getLabel()).basicRemove(otherEnd, msgs);
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__DESCRIPTION:
                return ((InternalEList<?>) getDescription()).basicRemove(otherEnd, msgs);
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__LABEL_REF:
                return ((InternalEList<?>) getLabelRef()).basicRemove(otherEnd, msgs);
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__DESCRIPTION_REF:
                return ((InternalEList<?>) getDescriptionRef()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__GROUP:
                if (coreType)
                    return getGroup();
                return ((FeatureMap.Internal) getGroup()).getWrapper();
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__LABEL:
                return getLabel();
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__DESCRIPTION:
                return getDescription();
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__LABEL_REF:
                return getLabelRef();
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__DESCRIPTION_REF:
                return getDescriptionRef();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__GROUP:
                ((FeatureMap.Internal) getGroup()).set(newValue);
                return;
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__LABEL:
                getLabel().clear();
                getLabel().addAll((Collection<? extends LabelType>) newValue);
                return;
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__DESCRIPTION:
                getDescription().clear();
                getDescription().addAll((Collection<? extends DescriptionType>) newValue);
                return;
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__LABEL_REF:
                getLabelRef().clear();
                getLabelRef().addAll((Collection<? extends LabelRefType>) newValue);
                return;
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__DESCRIPTION_REF:
                getDescriptionRef().clear();
                getDescriptionRef().addAll((Collection<? extends DescriptionRefType>) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__GROUP:
                getGroup().clear();
                return;
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__LABEL:
                getLabel().clear();
                return;
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__DESCRIPTION:
                getDescription().clear();
                return;
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__LABEL_REF:
                getLabelRef().clear();
                return;
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__DESCRIPTION_REF:
                getDescriptionRef().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__GROUP:
                return group != null && !group.isEmpty();
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__LABEL:
                return !getLabel().isEmpty();
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__DESCRIPTION:
                return !getDescription().isEmpty();
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__LABEL_REF:
                return !getLabelRef().isEmpty();
            case XDDPackage.CHARACTERISTIC_NAME_TYPE__DESCRIPTION_REF:
                return !getDescriptionRef().isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (group: ");
        result.append(group);
        result.append(')');
        return result.toString();
    }

} //CharacteristicNameTypeImpl
