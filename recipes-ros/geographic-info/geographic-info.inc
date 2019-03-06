SRC_URI = "https://github.com/ros-geographic-info/${ROS_SPN}/archive/${ROS_SP}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5fc55d38d02dda0cc161dba0e3548a24"
SRC_URI[sha256sum] = "2a2de063b17dc00c20bd49d59ded6934081fc22d8749dc8542d407d1ca0e608e"

DEPENDS += "cpp-common roscpp-serialization message-generation message-runtime std-msgs uuid-msgs geometry-msgs"

S = "${WORKDIR}/${ROS_SPN}-${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "geographic_info"
