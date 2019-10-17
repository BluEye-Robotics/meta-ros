DESCRIPTION = "JSON transport for ROS"
AUTHOR = "Paul Bovbel"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=37;endline=37;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "json-msgs roscpp"

RDEPENDS_${PN} = "python3-msgpack"

SRC_URI = "https://github.com/locusrobotics/json_transport-release/archive/release/melodic/json_transport/0.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4b3f8af4e6687772aa16614ed1583ebf"
SRC_URI[sha256sum] = "c7077ff6fff4119b0383218c2426ac4629ee02485af8e569920149031f791b2c"

S = "${WORKDIR}/json_transport-release-release-melodic-json_transport-0.0.3-0"

inherit catkin
