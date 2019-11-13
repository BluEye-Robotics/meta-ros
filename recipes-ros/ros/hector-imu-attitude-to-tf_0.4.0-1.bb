DESCRIPTION = "hector_imu_attitude_to_tf is a lightweight node that can be used to publish the roll/pitch attitude angles reported via a imu message to tf."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp tf roscpp tf"

RDEPENDS_${PN} = "roscpp tf"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/melodic/hector_imu_attitude_to_tf/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0c865ecf05daad57d81648c8685729a2"
SRC_URI[sha256sum] = "16d5505067c30a8e510904884e6d3b677faf0ed8b44fd3c3ac14c35261ff81b8"

ROS_SPN = "hector_slam"
S = "${WORKDIR}/hector_slam-release-release-melodic-hector_imu_attitude_to_tf-0.4.0-1"

inherit catkin
