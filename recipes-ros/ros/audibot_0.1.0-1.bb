DESCRIPTION = "Metapackage for audibot"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "audibot-gazebo audibot-description"

SRC_URI = "https://github.com/robustify/audibot-release/archive/release/melodic/audibot/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "02273e6d0ded254bcb1f64dcc3d43073"
SRC_URI[sha256sum] = "7e76b4daa4f12f798cfe9d6cb369a346f4c99ab31dc013ea460d3ee9c4b94570"

S = "${WORKDIR}/audibot-release-release-melodic-audibot-0.1.0-1"

inherit catkin
