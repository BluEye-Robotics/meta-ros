DESCRIPTION = "The rotors_gazebo_plugins package"
AUTHOR = "Fadri Furrer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

DEPENDS = "cmake-modules cv-bridge gazebo gazebo-plugins gazebo-ros geometry-msgs libgoogle-glog-dev protobuf-dev mavros mav-msgs octomap-msgs octomap-ros octomap rosbag roscpp rotors-comm rotors-control std-srvs tf yaml-cpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ethz-asl/rotors_simulator-release/archive/release/melodic/rotors_gazebo_plugins/2.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2d0ac96c44284c712167279449aef761"
SRC_URI[sha256sum] = "9a4fc0b6f45d9fe43292fa7b4656ea3190c32928c36b33aee9adfaa0c3fafcd2"

ROS_SPN = "rotors_simulator"
S = "${WORKDIR}/rotors_simulator-release-release-melodic-rotors_gazebo_plugins-2.2.3-0"

inherit catkin
