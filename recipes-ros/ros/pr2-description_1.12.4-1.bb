DESCRIPTION = "This package contains the description (mechanical, kinematic, visual, etc. ) of the PR2 robot. The files in this package are parsed and used by a variety of other components. Most users will not interact directly with this package."
AUTHOR = "John Hsu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "convex-decomposition ivcon xacro"

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/melodic/pr2_description/1.12.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "54d56eca2aa96010ac7cfc7ea01d9137"
SRC_URI[sha256sum] = "8614f27c6963296dfcd6091bb406ac8cb85b3d3ddc240ad390b6da44363d341e"

ROS_SPN = "pr2_common"
S = "${WORKDIR}/pr2_common-release-release-melodic-pr2_description-1.12.4-1"

inherit catkin
