package org.jenkinsci.plugins.chosen.sample;

import hudson.Extension;
import hudson.util.ListBoxModel;
import jenkins.plugins.ui_samples.UISample;
import jenkins.plugins.ui_samples.UISampleDescriptor;

/**
 * @author Kohsuke Kawaguchi
 */
@Extension(optional=true)
public class Chosen extends UISample {
    @Override
    public String getDescription() {
        return "Use Chosen for better combobox";
    }

    /**
     * Current value of the country field.
     *
     * In real use, this method would be a real getter, as opposed to a dummy method
     * that returns a constant value.
     */
    public String getCountry() {
        return "fr";
    }

    @Extension(optional=true)
    public static final class DescriptorImpl extends UISampleDescriptor {
        /**
         * Fill in the possible values, just like how you do with &lt;f:select/>
         */
        public ListBoxModel doFillCountryItems() {
            ListBoxModel r = new ListBoxModel();
            r.add("Japan","ja");
            r.add("United States of America","us");
            r.add("France","fr");
            r.add("Germany","de");
            return r;
        }
    }

}
