DESCRIPTION = "The ksql_airport package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "gazebo-ros"

SRC_URI = "https://github.com/ros-gbp/uav_testing-release/archive/release/melodic/ksql_airport/0.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "248960d7e7c1e69094ba69856e704bcc"
SRC_URI[sha256sum] = "b889d36b4514ad7eb0585a6a63a596a04cc2b909d1ba90ef3ca858be9a99de47"

ROS_SPN = "uav_testing"
S = "${WORKDIR}/uav_testing-release-release-melodic-ksql_airport-0.0.1-1"

inherit catkin
