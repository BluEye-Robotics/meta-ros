DESCRIPTION = "Package modeling the run-time dependencies for language bindings of messages."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cpp-common roscpp-serialization roscpp-traits rostime genpy"

RDEPENDS_${PN} = "cpp-common roscpp-serialization roscpp-traits rostime genpy"

SRC_URI = "https://github.com/ros-gbp/message_runtime-release/archive/release/melodic/message_runtime/0.4.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "18abcc106881077c8837b1c6309e928c"
SRC_URI[sha256sum] = "70669611054c91c2d65ae94d5e2474198970929338cbb76411cb560902b1c800"

S = "${WORKDIR}/message_runtime-release-release-melodic-message_runtime-0.4.12-0"

inherit catkin
