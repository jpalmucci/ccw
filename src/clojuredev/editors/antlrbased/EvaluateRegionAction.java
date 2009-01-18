/*******************************************************************************
 * Copyright (c) 2008 Laurent Petit.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: 
 *    Laurent PETIT - initial API and implementation
 *******************************************************************************/
package clojuredev.editors.antlrbased;

import org.eclipse.core.runtime.Assert;

public class EvaluateRegionAction extends EvaluateTextAction {

	public final static String ID = "EvaluateRegionAction"; //$NON-NLS-1$

	private final AntlrBasedClojureEditor editor;

	public EvaluateRegionAction(AntlrBasedClojureEditor editor) {
		super(ClojureEditorMessages.EvaluateRegionAction_label);
		Assert.isNotNull(editor);
		this.editor= editor;
		setEnabled(true);
	}

	public void run() {
		evaluateText(editor.getSelectedText());
	}
}
