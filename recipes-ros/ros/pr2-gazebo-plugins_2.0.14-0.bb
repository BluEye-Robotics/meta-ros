DESCRIPTION = "Gazebo Plugins for various PR2-specific sensors and actuators on the robot."
AUTHOR = "John Hsu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles cv-bridge diagnostic-msgs diagnostic-updater gazebo-msgs gazebo-plugins geometry-msgs image-transport message-generation message-runtime nav-msgs polled-camera pr2-controller-manager pr2-hardware-interface pr2-mechanism-model pr2-msgs roscpp rospy sensor-msgs std-msgs std-srvs tf urdf orocos-kdl gazebo-ros gazebo-plugins gazebo-msgs roscpp rospy tf std-msgs nav-msgs sensor-msgs pr2-msgs geometry-msgs diagnostic-msgs diagnostic-updater cv-bridge angles pr2-hardware-interface pr2-controller-manager pr2-mechanism-model urdf polled-camera image-transport message-runtime message-generation orocos-kdl"

RDEPENDS_${PN} = "gazebo-ros gazebo-plugins gazebo-msgs roscpp rospy tf std-msgs nav-msgs sensor-msgs pr2-msgs geometry-msgs diagnostic-msgs diagnostic-updater cv-bridge angles pr2-hardware-interface pr2-controller-manager pr2-mechanism-model urdf polled-camera image-transport message-runtime message-generation orocos-kdl"

SRC_URI = "https://github.com/pr2-gbp/pr2_simulator-release/archive/release/melodic/pr2_gazebo_plugins/2.0.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9028427fc0d7ab592ca6ba58cc2403ec"
SRC_URI[sha256sum] = "f13b8d70bb7029d167343772dc662a7aff687349c40ecb02e27020a36a8a784b"

ROS_SPN = "pr2_simulator"
S = "${WORKDIR}/pr2_simulator-release-release-melodic-pr2_gazebo_plugins-2.0.14-0"

inherit catkin
