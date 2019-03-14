DESCRIPTION = "Controller for a four wheel steering mobile base."
AUTHOR = "Vincent Rousseau"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-interface nav-msgs four-wheel-steering-msgs realtime-tools tf urdf-geometry-parser"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/four_wheel_steering_controller/0.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "26d15545b9b2d02eb84d3a6727bb634e"
SRC_URI[sha256sum] = "48e4ae7cd1abdc9a712f3b0d388f047a474e942bebcdefd40cfb5da9890676fd"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-four_wheel_steering_controller-0.14.3-0"

inherit catkin
