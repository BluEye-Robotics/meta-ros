DESCRIPTION = "This package retrieves data from url-format files such as http://, ftp://, package:// file://, etc. , and loads the data into memory. The package:// url for ros packages is translated into a local file:// url. The resourse retriever was initially designed to load mesh files into memory, but it can be used for any type of data. The resource retriever is based on the the libcurl library."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "curl roslib rosconsole boost"

RDEPENDS_${PN} = "python3-rospkg python3-rospkg"

SRC_URI = "https://github.com/ros-gbp/resource_retriever-release/archive/release/melodic/resource_retriever/1.12.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4b4e4ae3ae0e5488f9ee8b4645c29569"
SRC_URI[sha256sum] = "4a1ac42150b348eed92838078929e4ac8ea5123c9d16c39e88412a3724640cce"

S = "${WORKDIR}/resource_retriever-release-release-melodic-resource_retriever-1.12.5-1"

inherit catkin
