DESCRIPTION = "Configuration and launch files to control the ECA A9 AUV"
AUTHOR = "Thibault Pelletier"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "uuv-teleop uuv-trajectory-control"

SRC_URI = "https://github.com/uuvsimulator/eca_a9-release/archive/release/melodic/eca_a9_control/0.1.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c2129c71d771d61338a968a1e69dd35a"
SRC_URI[sha256sum] = "2c5e9d6e0a17f5cf7b07029ac6e1df1dbcb1d47b77737b8c1d5a1eefd3254c1e"

ROS_SPN = "eca_a9"
S = "${WORKDIR}/eca_a9-release-release-melodic-eca_a9_control-0.1.6-0"

inherit catkin
