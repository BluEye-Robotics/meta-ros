SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "927cf88d208b9994e8c28d97302cfc99"
SRC_URI[sha256sum] = "a9d8c7655d426afe8bc2b021e0bc8ce25dae70ca35b985a0ec0b8b5768722bd4"

DEPENDS += "cpp-common roscpp-serialization message-generation message-runtime std-msgs"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "common_msgs"
