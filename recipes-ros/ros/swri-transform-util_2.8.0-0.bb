DESCRIPTION = "The swri_transform_util package contains utility functions and classes for transforming between coordinate frames."
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cv-bridge diagnostic-msgs geographic-msgs geometry-msgs gps-common libgeos++-dev nodelet proj roscpp rospy swri-math-util swri-nodelet swri-roscpp swri-yaml-util tf topic-tools yaml-cpp"

RDEPENDS_${PN} = "sensor-msgs"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_transform_util/2.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "80cdfcc963de51db471178abfb3e72db"
SRC_URI[sha256sum] = "f6532904852bb800d11213f89b6503213a9d7b2f1e3d138755ada636c0209bb5"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_transform_util-2.8.0-0"

inherit catkin
