DESCRIPTION = "This library provides functionality to simplify working with the navigation messages defined in marti_nav_msgs."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "marti-common-msgs marti-nav-msgs roscpp swri-transform-util swri-math-util swri-geometry-util visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_route_util/2.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a492e3c0bac242c6930d1f3ce8613111"
SRC_URI[sha256sum] = "abb33dfe7604804a00e7a03fc1b8460067b3302851e54df037dfcbe1ab0fbe04"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_route_util-2.8.0-0"

inherit catkin
