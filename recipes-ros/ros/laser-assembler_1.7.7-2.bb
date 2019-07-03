DESCRIPTION = "Provides nodes to assemble point clouds from either LaserScan or PointCloud messages"
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation sensor-msgs message-filters tf roscpp rostest filters laser-geometry pluginlib message-runtime sensor-msgs message-filters roscpp tf filters laser-geometry pluginlib"

RDEPENDS_${PN} = "message-runtime sensor-msgs message-filters roscpp tf filters laser-geometry pluginlib"

SRC_URI = "https://github.com/ros-gbp/laser_assembler-release/archive/release/melodic/laser_assembler/1.7.7-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "33a690569117d6f21c5da236cbbab62f"
SRC_URI[sha256sum] = "7a1c69cc848803f8521457bb7e2d720219e38c1d7e66daa15d06f13b3b05f9b6"

S = "${WORKDIR}/laser_assembler-release-release-melodic-laser_assembler-1.7.7-2"

inherit catkin
