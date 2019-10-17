DESCRIPTION = "This library provides functionality to simplify working with the navigation messages defined in marti_nav_msgs."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "marti-common-msgs marti-nav-msgs roscpp swri-transform-util swri-math-util swri-geometry-util visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_route_util/2.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5aa61c625eb4409d32c278470a35875f"
SRC_URI[sha256sum] = "7c5b2353c9f6fcfaa348661b076c65226bc6c71e5c3741d95482ff316fdcbad5"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_route_util-2.9.0-1"

inherit catkin
