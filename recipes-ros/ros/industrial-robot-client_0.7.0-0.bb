DESCRIPTION = "industrial robot client contains generic clients for connecting to industrial robot controllers with servers that adhere to the simple message protocol."
AUTHOR = "Jeremy Zoss"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs sensor-msgs control-msgs trajectory-msgs simple-message actionlib-msgs actionlib urdf industrial-msgs industrial-utils roslaunch roscpp std-msgs sensor-msgs control-msgs trajectory-msgs simple-message actionlib-msgs actionlib urdf industrial-msgs industrial-utils robot-state-publisher"

RDEPENDS_${PN} = "roscpp std-msgs sensor-msgs control-msgs trajectory-msgs simple-message actionlib-msgs actionlib urdf industrial-msgs industrial-utils robot-state-publisher"

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_robot_client/0.7.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "69f4473ec204e2c7a648425ff78e5027"
SRC_URI[sha256sum] = "c1039af144fc2cbd4de93b448d60d1a5bb417d8ad72f428324ed5a489e882424"

ROS_SPN = "industrial_core"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_robot_client-0.7.0-0"

inherit catkin
