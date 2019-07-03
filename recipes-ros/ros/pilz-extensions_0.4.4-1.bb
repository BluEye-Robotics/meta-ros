DESCRIPTION = "The pilz_extensions package. Here are classes extending the functionality of other packages. On the long run these extensions should become pull requests on the respective packages."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp joint-limits-interface"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_extensions/0.4.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cd53883f35bd1e40349baccad3f0eba7"
SRC_URI[sha256sum] = "323d7345e2b1e359852e2212ddc8f084be27cb113fce723d9015b81b22bcb9ea"

ROS_SPN = "pilz_industrial_motion"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_extensions-0.4.4-1"

inherit catkin
