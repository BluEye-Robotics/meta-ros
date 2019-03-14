DESCRIPTION = "hector_sensors_gazebo depends on the necessary plugins for using the sensors from the hector_models repository."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "hector-sensors-description gazebo-plugins hector-gazebo-plugins"

RDEPENDS_${PN} = "hector-sensors-description gazebo-plugins hector-gazebo-plugins"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release/archive/release/melodic/hector_sensors_gazebo/0.5.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4774ecd31703f04cb08b6a9fbbadaba9"
SRC_URI[sha256sum] = "f6c2dbc7c925947b911f5fc7065443bd12d24193b7a9168347c560fab1300d09"

ROS_SPN = "hector_gazebo"
S = "${WORKDIR}/hector_gazebo-release-release-melodic-hector_sensors_gazebo-0.5.1-0"

inherit catkin
