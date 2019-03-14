DESCRIPTION = "This package contains the description (mechanical, kinematic, visual, etc. ) of the PR2 robot. The files in this package are parsed and used by a variety of other components. Most users will not interact directly with this package."
AUTHOR = "John Hsu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "convex-decomposition ivcon xacro"

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/melodic/pr2_description/1.12.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1e49bb527625f9a40a4fea96355797e3"
SRC_URI[sha256sum] = "dd73a6a8dc3713503e0f502a3d1940a80a3b96de75e68197d270bff8f3a30aa1"

ROS_SPN = "pr2_common"
S = "${WORKDIR}/pr2_common-release-release-melodic-pr2_description-1.12.3-0"

inherit catkin
