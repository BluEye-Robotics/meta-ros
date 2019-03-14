DESCRIPTION = "This package retrieves data from url-format files such as http://, ftp://, package:// file://, etc. , and loads the data into memory. The package:// url for ros packages is translated into a local file:// url. The resourse retriever was initially designed to load mesh files into memory, but it can be used for any type of data. The resource retriever is based on the the libcurl library."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "curl roslib rosconsole boost"

RDEPENDS_${PN} = "python-rospkg"

SRC_URI = "https://github.com/ros-gbp/resource_retriever-release/archive/release/melodic/resource_retriever/1.12.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d2dc62ac933321bb52490295066c4727"
SRC_URI[sha256sum] = "568a6d1f0bd3a0c6e4c26b6e6524bc14a282df35a6b3ea1720e37591aaf024a1"

S = "${WORKDIR}/resource_retriever-release-release-melodic-resource_retriever-1.12.4-0"

inherit catkin
