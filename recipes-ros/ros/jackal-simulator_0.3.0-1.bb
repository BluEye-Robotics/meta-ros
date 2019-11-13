DESCRIPTION = "Packages for simulating Jackal."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "jackal-gazebo"

RDEPENDS_${PN} = "jackal-gazebo"

SRC_URI = "https://github.com/clearpath-gbp/jackal_simulator-release/archive/release/melodic/jackal_simulator/0.3.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bb405cac00f463287de8d98344071e9f"
SRC_URI[sha256sum] = "54d03ef799f70826356e17989b437e8eb28de08fdb9cff40d7ed275e63fc263b"

S = "${WORKDIR}/jackal_simulator-release-release-melodic-jackal_simulator-0.3.0-1"

inherit catkin
