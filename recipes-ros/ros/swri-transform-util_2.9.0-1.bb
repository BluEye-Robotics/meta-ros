DESCRIPTION = "The swri_transform_util package contains utility functions and classes for transforming between coordinate frames."
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cv-bridge diagnostic-msgs geographic-msgs geometry-msgs gps-common libgeos++-dev nodelet proj roscpp rospy swri-math-util swri-nodelet swri-roscpp swri-yaml-util tf topic-tools yaml-cpp"

RDEPENDS_${PN} = "sensor-msgs"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_transform_util/2.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2c971f769194d93fb15a09a071ab08f5"
SRC_URI[sha256sum] = "c7d2224695478d5f4b913607874f6cc975845779d64cb6c901e912fcfa2d62dc"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_transform_util-2.9.0-1"

inherit catkin
