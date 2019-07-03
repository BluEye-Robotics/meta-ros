DESCRIPTION = "Contains scripts that are useful as prefix commands for nodes started by roslaunch."
AUTHOR = "Elliot Johnson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "python-psutil"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_prefix_tools/2.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2ed37497a9a4e24d00317e487f0830f9"
SRC_URI[sha256sum] = "3e1077da7dafe7e3995f81672b192a4ed0ce9bdf85aa432335046a6e19a22f7e"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_prefix_tools-2.9.0-1"

inherit catkin
