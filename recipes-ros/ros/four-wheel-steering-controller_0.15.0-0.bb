DESCRIPTION = "Controller for a four wheel steering mobile base."
AUTHOR = "Vincent Rousseau"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-interface nav-msgs four-wheel-steering-msgs realtime-tools tf urdf-geometry-parser"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/four_wheel_steering_controller/0.15.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "268c75a083fb536da19e101d17e96365"
SRC_URI[sha256sum] = "bd529d3a98a4ca99a6965a27d09a019ab15fbb247be61246e4c949bed5ae9fcb"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-four_wheel_steering_controller-0.15.0-0"

inherit catkin
