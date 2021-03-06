//
// svm_model
//
package com.jusdt.datamining.statistical.learning.ann;

import java.io.Serializable;

public class ANNModel implements Serializable {

	private static final long serialVersionUID = 1L;

	//svm支持向量机的参数
	ANNParameter param; // parameter
	//分类的类型数
	int nr_class; // number of classes, = 2 in regression/one class svm
	int l; // total #SV
	ANNNode[][] SV; // SVs (SV[l])
	double[][] sv_coef; // coefficients for SVs in decision functions (sv_coef[k-1][l])
	double[] rho; // constants in decision functions (rho[k*(k-1)/2])
	double[] probA; // pariwise probability information
	double[] probB;

	// for classification only

	//每个类型的类型值
	int[] label; // label of each class (label[k])
	int[] nSV; // number of SVs for each class (nSV[k])
	// nSV[0] + nSV[1] + ... + nSV[k-1] = l

};
