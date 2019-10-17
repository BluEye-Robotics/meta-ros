DESCRIPTION = "This library provides functionality to simplify working with the navigation messages defined in marti_nav_msgs."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "marti-common-msgs marti-nav-msgs roscpp swri-transform-util swri-math-util swri-geometry-util visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_route_util/2.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3f92fa0b32df267820f9e7f783760096"
SRC_URI[sha256sum] = "3b44ab4f608f5f77652c0689f2bac71f419b721a6520da2a8ffd566603f16aa8"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_route_util-2.10.0-1"

inherit catkin
