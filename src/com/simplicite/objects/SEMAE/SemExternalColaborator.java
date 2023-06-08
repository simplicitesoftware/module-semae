package com.simplicite.objects.SEMAE;

import java.util.*;

import com.simplicite.util.*;
import com.simplicite.util.exceptions.*;
import com.simplicite.util.tools.*;

/**
 * Business object SemExternalColaborator
 */
public class SemExternalColaborator extends com.simplicite.objects.System.SimpleUser {
	private static final long serialVersionUID = 1L;
	private static final String RESPONSIBILITY = "SEM_EXTERNAL";
	
	@Override
	public void postLoad() {
		super.postLoad();
		final String moduleId = ModuleDB.getModuleId("SEMAE");

		// Langue non visible + valeur par défaut = français
		ObjectField f = getField("usr_lang");
		f.setVisibility(ObjectField.VIS_NOT);
		f.setDefaultValue(Globals.LANG_FRENCH);
		f = getField("usr_lang_pref", false);
		if (f != null) {
			f.setVisibility(ObjectField.VIS_NOT);
			f.setDefaultValue(Globals.LANG_FRENCH);
		}

		// Home non visible
		f = getField("usr_home_id");
		f.setVisibility(ObjectField.VIS_NOT);

		// Module non visible + valeur par défaut
		f = getField("row_module_id");
		f.setVisibility(ObjectField.VIS_NOT);
		f.setDefaultValue(moduleId);

		// Etat non visible
		getField("usr_active").setVisibility(ObjectField.VIS_NOT);
		// pas de sous-menu des états
		setMenuStates(false);

		// Attributs obligatoires
		//getField("usr_first_name").setRequired(true);
		//getField("usr_last_name").setRequired(true);

		// Filtrage des users du module
		setSearchSpec("t.row_module_id = " + moduleId);
	}
	
	@Override
	public List<String> preValidate() {
		super.preValidate();
		getField("usr_active").setValue("1"); // Force le statut à actif
		return null;
	}
	
	@Override
	public String postSave() {
		Grant g = getGrant();
		Grant.addResponsibility(getRowId(), RESPONSIBILITY);
		return null;
	}
}
