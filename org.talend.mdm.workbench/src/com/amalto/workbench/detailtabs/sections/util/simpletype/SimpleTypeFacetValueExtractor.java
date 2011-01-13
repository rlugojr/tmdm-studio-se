package com.amalto.workbench.detailtabs.sections.util.simpletype;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xsd.XSDFacet;

public class SimpleTypeFacetValueExtractor {

    private SimpleTypeFacetValueExtractor() {
    }

    public static String[] getStringArrayFacetValue(List<?> values) {

        List<String> enums = new ArrayList<String>();
        for (Object eachFacetValue : values) {

            if (!(eachFacetValue instanceof XSDFacet))
                continue;

            enums.add(((XSDFacet) eachFacetValue).getLexicalValue());
        }

        return enums.toArray(new String[0]);

    }

    public static String getStringFacetValue(XSDFacet facet) {

        if (facet == null)
            return "";

        String result = "";

        try {
            result = facet.getLexicalValue();
        } catch (Exception e) {
            return "";
        }

        return (result == null ? "" : result);
    }

    public static Integer getIntFacetValue(XSDFacet facet) {

        if (facet == null)
            return 0;

        Integer result = 0;

        try {
            result = Integer.parseInt(facet.getLexicalValue());
        } catch (Exception e) {
            return 0;
        }

        return result;

    }

    public static Double getDoubleFacetValue(XSDFacet facet) {

        if (facet == null)
            return 0d;

        Double result = 0d;

        try {
            result = Double.parseDouble(facet.getLexicalValue());
        } catch (Exception e) {
            return 0d;
        }

        return result;

    }
}
