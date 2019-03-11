DESCRIPTION = "Maintains the ecl licenses and also provides an install target \
  for deploying licenses with the ecl libraries."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"
SRC_URI[md5sum] = "e071adbfb40e1b17424512dac77821ec"
SRC_URI[sha256sum] = "83dac8d8bdefec91d67a5d0ab69f395e2a66c2fc80de3c3962894bb49d32d4ed"

S = "${WORKDIR}/${ROS_SPN}-release-release-melodic-${ROS_BPN}"


require ecl-tools.inc
