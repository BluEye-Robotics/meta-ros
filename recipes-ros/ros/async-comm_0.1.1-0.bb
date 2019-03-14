DESCRIPTION = "A C++ library for asynchronous serial communication"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost"

RDEPENDS_${PN} = "boost catkin"

SRC_URI = "https://github.com/dpkoch/async_comm-release/archive/release/melodic/async_comm/0.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "acd4969fd445ab94f1ae6e5b8a224063"
SRC_URI[sha256sum] = "9a87d3e8db68cf7c7fc3c318f1d31d6660dd5ca39172d0f78efdf6330de49bcc"

S = "${WORKDIR}/async_comm-release-release-melodic-async_comm-0.1.1-0"

inherit catkin
