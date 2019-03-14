DESCRIPTION = "Controller for a differential drive mobile base."
AUTHOR = "Bence Magyar"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-interface dynamic-reconfigure nav-msgs realtime-tools tf urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/diff_drive_controller/0.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7f3ea24aa308b024099ece4e5f3f0233"
SRC_URI[sha256sum] = "93692d0c5cc880e511ca179ba0e482e4afcc79c5dced306af42747984df000bf"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-diff_drive_controller-0.14.3-0"

inherit catkin
