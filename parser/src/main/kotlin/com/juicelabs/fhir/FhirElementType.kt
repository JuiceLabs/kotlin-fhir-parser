package com.juicelabs.fhir

import com.google.gson.JsonElement
import com.google.gson.JsonObject

class FhirElementType(dict: JsonObject? = null) {

    val code: String?
    val profile: JsonElement?

    init {
        code = if (dict != null && dict.has("code")) dict["code"].asString.capitalize() else null

        if (code != null) {
            // todo check for valid code
//            if self.code is not None and not _is_string(self.code):
//            raise Exception("Expecting a string for 'code' definition of an element type, got {} as {}"
//                    .format(self.code, type(self.code)))

        }

        if (dict != null && dict.has("targetProfile")) {

            profile = dict["targetProfile"]
//            if not isinstance(type_dict.get('targetProfile'), (list,)):
//               self.profile = type_dict.get('targetProfile')
//               if self.profile is not None and not _is_string(self.profile) and not isinstance(type_dict.get('targetProfile'), (list,)): #Added a check to make sure the targetProfile wasn't a list
//                 raise Exception("Expecting a string for 'targetProfile' definition of an element type, got {} as {}"
//                    .format(self.profile, type(self.profile)))
        } else {
            profile = null
        }
    }
}