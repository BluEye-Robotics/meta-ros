DESCRIPTION = "Package with launch files for demonstrations with the ECA A9 AUV"
AUTHOR = "Thibault Pelletier"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "eca-a9-description eca-a9-control"

SRC_URI = "https://github.com/uuvsimulator/eca_a9-release/archive/release/melodic/eca_a9_gazebo/0.1.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f94987f00d700f237233aea9da99fe4c"
SRC_URI[sha256sum] = "e2dce04036c923f6df2b176be5b73ffc2f2f7002fb0c2db7f54d2ea686499d9e"

ROS_SPN = "eca_a9"
S = "${WORKDIR}/eca_a9-release-release-melodic-eca_a9_gazebo-0.1.6-0"

inherit catkin
