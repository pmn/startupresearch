(ns startupresearch.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [startupresearch.core-test]
   [startupresearch.common-test]))

(enable-console-print!)

(doo-tests 'startupresearch.core-test
           'startupresearch.common-test)
