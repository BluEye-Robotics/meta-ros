DESCRIPTION = "Sample launch files to start a simulated LAUV in Gazebo."
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "lauv-description lauv-control uuv-control-utils rosbag"

SRC_URI = "https://github.com/uuvsimulator/lauv_gazebo-release/archive/release/melodic/lauv_gazebo/0.1.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "20a94f4fc4f97b6cc5d466c11dd38c44"
SRC_URI[sha256sum] = "ba4a2d4a1567b183be8c500d5dc714ebbec6802532da93eaab20cc7cdb6a266c"

S = "${WORKDIR}/lauv_gazebo-release-release-melodic-lauv_gazebo-0.1.6-0"

inherit catkin
