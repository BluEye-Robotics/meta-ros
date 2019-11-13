DESCRIPTION = "Launchfiles to use Jackal in Gazebo."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch gazebo-ros gazebo-ros-control gazebo-plugins hector-gazebo-plugins jackal-control jackal-description"

RDEPENDS_${PN} = "gazebo-ros gazebo-ros-control gazebo-plugins hector-gazebo-plugins jackal-control jackal-description"

SRC_URI = "https://github.com/clearpath-gbp/jackal_simulator-release/archive/release/melodic/jackal_gazebo/0.3.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d21e6fa1ffce5ebe988f5b8f0d68d223"
SRC_URI[sha256sum] = "db2847baf2697abcf028c25bead148a173d13c5720be43386ed27c4a385f8931"

ROS_SPN = "jackal_simulator"
S = "${WORKDIR}/jackal_simulator-release-release-melodic-jackal_gazebo-0.3.0-1"

inherit catkin
