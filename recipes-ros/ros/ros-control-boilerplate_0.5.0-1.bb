DESCRIPTION = "Simple simulation interface and template for setting up a hardware interface for ros_control"
AUTHOR = "Dave Coleman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "hardware-interface controller-manager roscpp control-msgs trajectory-msgs actionlib urdf joint-limits-interface transmission-interface control-toolbox std-msgs cmake-modules libgflags-dev sensor-msgs rosparam-shortcuts hardware-interface controller-manager roscpp control-msgs trajectory-msgs actionlib urdf joint-limits-interface transmission-interface control-toolbox std-msgs sensor-msgs rosparam-shortcuts"

RDEPENDS_${PN} = "hardware-interface controller-manager roscpp control-msgs trajectory-msgs actionlib urdf joint-limits-interface transmission-interface control-toolbox std-msgs sensor-msgs rosparam-shortcuts"

SRC_URI = "https://github.com/PickNikRobotics/ros_control_boilerplate-release/archive/release/melodic/ros_control_boilerplate/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f02eb52952d192de13f6f6a237cf88e7"
SRC_URI[sha256sum] = "0a7ce80db50a833c0ac201c31caba85ebdc1192a279adcc9b5e61ab86c1b7899"

S = "${WORKDIR}/ros_control_boilerplate-release-release-melodic-ros_control_boilerplate-0.5.0-1"

inherit catkin
