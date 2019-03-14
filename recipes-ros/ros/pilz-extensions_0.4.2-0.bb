DESCRIPTION = "The pilz_extensions package. Here are classes extending the functionality of other packages. On the long run these extensions should become pull requests on the respective packages."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp joint-limits-interface prbt-support"

RDEPENDS_${PN} = "prbt-support"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_extensions/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "784a9459c71cf7cc925c02364af13f59"
SRC_URI[sha256sum] = "e424ed432021db160b038cfb5aadb2bec718f5b919a50bd9fabd47488df1a300"

ROS_SPN = "pilz_industrial_motion"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_extensions-0.4.2-0"

inherit catkin
