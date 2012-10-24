package org.jenkinsci.plugins.chosen.sample.Chosen

def s = namespace("/lib/samples")
def c = namespace("/lib/chosen")
def f = namespace(lib.FormTagLib)

s.sample(title:"Using Chosen") {
    f.form {
        f.entry(title:"Single select",field:"country") {
            c.chosen()
        }
    }
}