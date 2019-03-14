DESCRIPTION = "hector_gazebo_thermal_camera provides a gazebo plugin that produces simulated thermal camera images. The plugin uses modified code from the gazebo_ros_camera plugin."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp gazebo-plugins roscpp gazebo gazebo-plugins"

RDEPENDS_${PN} = "roscpp gazebo gazebo-plugins"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release/archive/release/melodic/hector_gazebo_thermal_camera/0.5.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8454a7bddc3c17e7b2501afbc16ee1cb"
SRC_URI[sha256sum] = "6a3221be450c74fed270dcff5e3399e8e5650169b2bdf36ecf588a9602d95a2c"

ROS_SPN = "hector_gazebo"
S = "${WORKDIR}/hector_gazebo-release-release-melodic-hector_gazebo_thermal_camera-0.5.1-0"

inherit catkin
