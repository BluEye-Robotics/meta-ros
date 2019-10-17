DESCRIPTION = "Contains scripts that are useful as prefix commands for nodes started by roslaunch."
AUTHOR = "Elliot Johnson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "python3-psutil"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_prefix_tools/2.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "24dfc87562deca8e9331e976fcab10f7"
SRC_URI[sha256sum] = "afcef9c0f07a6e3e124bb40559159a2dbae4d205c6638ceffca3babc6564ced3"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_prefix_tools-2.10.0-1"

inherit catkin
