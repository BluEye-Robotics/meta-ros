DESCRIPTION = "Package with launch files for demonstrations with the RexROV 2 vehicle"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "rexrov2-description rexrov2-control"

SRC_URI = "https://github.com/uuvsimulator/rexrov2-release/archive/release/melodic/rexrov2_gazebo/0.1.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1ae78ab43c4652771c12a6f82ccfa3eb"
SRC_URI[sha256sum] = "ae244517e996486264c129ef22354f23c9e84f3e32be10a5fd7fa193bd0b15d9"

ROS_SPN = "rexrov2"
S = "${WORKDIR}/rexrov2-release-release-melodic-rexrov2_gazebo-0.1.3-0"

inherit catkin
