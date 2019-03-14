DESCRIPTION = "Simple simulation interface and template for setting up a hardware interface for ros_control"
AUTHOR = "Dave Coleman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "hardware-interface controller-manager roscpp control-msgs trajectory-msgs actionlib urdf joint-limits-interface transmission-interface control-toolbox std-msgs cmake-modules libgflags-dev sensor-msgs rosparam-shortcuts hardware-interface controller-manager roscpp control-msgs trajectory-msgs actionlib urdf joint-limits-interface transmission-interface control-toolbox std-msgs sensor-msgs rosparam-shortcuts"

RDEPENDS_${PN} = "hardware-interface controller-manager roscpp control-msgs trajectory-msgs actionlib urdf joint-limits-interface transmission-interface control-toolbox std-msgs sensor-msgs rosparam-shortcuts"

SRC_URI = "https://github.com/PickNikRobotics/ros_control_boilerplate-release/archive/release/melodic/ros_control_boilerplate/0.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "90bce63741e3756f50d9f2ee42661a2e"
SRC_URI[sha256sum] = "b597b2799ddfb59bdc4e395c3392f794594606bf24e929ebcf03e4cb253dc576"

S = "${WORKDIR}/ros_control_boilerplate-release-release-melodic-ros_control_boilerplate-0.4.1-0"

inherit catkin
