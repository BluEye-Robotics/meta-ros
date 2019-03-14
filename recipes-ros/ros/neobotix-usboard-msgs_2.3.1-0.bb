DESCRIPTION = "neobotix_usboard package"
AUTHOR = "Sam Rustan"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/melodic/neobotix_usboard_msgs/2.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4bdbdfa5ed671f9e7b564e476c91ebef"
SRC_URI[sha256sum] = "a85796618e8e9b7092aff7b93ed2c83becbf7f6ad4ba74fdd2afacdee2f800bf"

ROS_SPN = "astuff_sensor_msgs"
S = "${WORKDIR}/astuff_sensor_msgs-release-release-melodic-neobotix_usboard_msgs-2.3.1-0"

inherit catkin
